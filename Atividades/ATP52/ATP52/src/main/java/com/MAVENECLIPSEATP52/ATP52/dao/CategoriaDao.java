package com.MAVENECLIPSEATP52.ATP52.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.MAVENECLIPSEATP52.ATP52.model.Categoria;



public class CategoriaDao {
	public int insert(Categoria model) {
		int id = 0;
		try (Connection conn = new ConnectionFactory().getCondition()) {
			String sql = "INSERT INTO categoria(nome) values(?)";
			PreparedStatement preparedStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, model.getNome());

			preparedStatement.execute();
			ResultSet ids = preparedStatement.getGeneratedKeys();

			while (ids.next()) {
				id = ids.getInt("id");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return id;

	}

	public ArrayList<Categoria> read() {
		ArrayList<Categoria> list = new ArrayList<Categoria>();

		try (Connection conn = new ConnectionFactory().getCondition()) {

			PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM categoria");
			preparedStatement.execute();
			ResultSet resultSet = preparedStatement.getResultSet();

			while (resultSet.next()) {
				Categoria model = new Categoria();
				model.setId(resultSet.getInt("id"));
				model.setNome(resultSet.getString("nome"));
				list.add(model);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public int update(Categoria model) {
		int linhasAfetadas = 0;
		try (Connection conn = new ConnectionFactory().getCondition()) {

			String sql = "UPDATE categoria SET nome = ? WHERE id = ?";
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, model.getNome());
			preparedStatement.setInt(2, model.getId());

			preparedStatement.execute();

			linhasAfetadas = preparedStatement.getUpdateCount();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return linhasAfetadas;
	}

	public int delete(Categoria model) {
		int linhasAfetadas = 0;
		try (Connection conn = new ConnectionFactory().getCondition()) {
			String sql = "DELETE FROM categoria WHERE id = ?";

			try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
				preparedStatement.setInt(1, model.getId());
				preparedStatement.execute();
				linhasAfetadas = preparedStatement.getUpdateCount();

			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return linhasAfetadas;
	}
}

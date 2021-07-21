package com.ns.hibernateCustomIdGeneration.GetID_From_Table.generator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class DepartmentIdGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		String prefix = "DEP";
		Connection connection = session.connection();

		try {
			Statement statement = connection.createStatement();

			ResultSet rs = statement.executeQuery("select count(Department_Id) as Id from hibernate_custom_id_generation.Department");

			if (rs.next()) {
				int id = rs.getInt(1) + 101;
				String generatedId = prefix + new Integer(id).toString();
				System.out.println("Generated Id: " + generatedId);
				return generatedId;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

}

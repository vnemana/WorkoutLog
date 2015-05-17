package com.vnemana.workoutlog;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDatabaseOperations {

	@Test
	public void testDBCreation() {
		DBManager dbmgr = new DBManager("WorkoutLogDB");
		assertNotNull (dbmgr); 
	}
}

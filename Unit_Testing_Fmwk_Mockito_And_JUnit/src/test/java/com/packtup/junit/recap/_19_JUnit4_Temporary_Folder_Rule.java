package com.packtup.junit.recap;

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

/* The TemporaryFolder rule allows the creation of files and folders that are 
 * guaranteed to be deleted when the test method finishes, irrespective of whether 
 * it passes or fails */


public class _19_JUnit4_Temporary_Folder_Rule 
{
	@Rule  
	public TemporaryFolder folder = new TemporaryFolder();

	@Test
	public void testUsingTempFolder() throws IOException 
	{
		File createdFile = folder.newFile("myfile.txt");
		File createdFolder = folder.newFolder("mysubfolder");
	}
}

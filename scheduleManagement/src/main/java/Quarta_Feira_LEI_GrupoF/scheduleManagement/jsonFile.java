package Quarta_Feira_LEI_GrupoF.scheduleManagement;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class jsonFile {
	
	private List<Object> data;
	
	public jsonFile(String filename) throws IOException {
		// Read the JSON file and deserialize its contents into a list of objects
		ObjectMapper mapper = new ObjectMapper();
		this.data = mapper.readValue(new File(filename), new TypeReference<List<Object>>() {});
	}
	
	public jsonFile(List<Object> data) {
		// Initialize the JsonFile with a list of objects
		this.data = data;
	}
	
	public List<Object> getList() {
		return this.data;
	}
	
	public void saveFile(String newFileName) throws JsonProcessingException, IOException {
		// Serialize the data list to JSON and write it to the specified file
		ObjectMapper mapper = new ObjectMapper();
		mapper.writerWithDefaultPrettyPrinter().writeValue(new File(newFileName), this.data);
	}
}

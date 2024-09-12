package Paccore.data;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataReader {
	
	public List<HashMap<String, String>> getJsonDatatoMap(String filePath) throws IOException {
		//read json to string
		String JsonContent=FileUtils.readFileToString(new File(filePath),
				StandardCharsets.UTF_8);
		//string to HashMap
		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String,String>> data=mapper.readValue(JsonContent, new TypeReference<List<HashMap<String,String>>>() {
		});
		return data;
	}

}

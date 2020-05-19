package mx.com.telcel.Rest;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import mx.com.telcel.model.ModelData;

@RestController
@RequestMapping(path="/restData")
public class RestData {
	
	@GetMapping(path="/obtenDatos",produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ModelData getData(@RequestParam(name="msg") String message) {
		ModelData modelData = new ModelData();
		
		modelData.setCode(200);
		modelData.setEstatus(true);
		modelData.setMessage("Mensaje recibido: " + message);
		return modelData;
	}
	
}

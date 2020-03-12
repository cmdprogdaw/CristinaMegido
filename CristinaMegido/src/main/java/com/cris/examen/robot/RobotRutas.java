package com.cris.examen.robot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cris.examen.beans.Builder;

@RestController
public class RobotRutas {

	
	@Autowired
	Builder robot;
	
	
	@PostMapping("/ordenesRobot")
	ResponseEntity<Robot> ordenesRobot(@RequestBody Robot robot) {
		
		robot.setId(1);
		robot.setOrden("Correr");
		
		System.out.println(robot);
		
		return new ResponseEntity<Robot>(robot, HttpStatus.OK);
	}
}

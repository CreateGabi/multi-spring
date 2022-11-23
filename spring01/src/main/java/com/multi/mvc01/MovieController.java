package com.multi.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {

	@RequestMapping("movie.multi")
	public String movie(String movie) {
		if (movie.equals("코미디")) {
			return "comic";
		} else if (movie.equals("드라마")) {
			return "drama";
		} else if (movie.equals("액션")){
			return "action";
		} else {
			return "no";
		}
	}
}

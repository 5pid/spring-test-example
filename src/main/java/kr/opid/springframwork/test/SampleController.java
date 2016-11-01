package kr.opid.springframwork.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yeongjun on 2016. 11. 1.
 */
@Controller
@RequestMapping("/")
public class SampleController {

	@GetMapping
	@ResponseBody
	public String test() {
		return "test";
	}
}

package com.example.clothingchooser;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping()
public class TestController {


        @Autowired
        private JdbcTemplate jdbcTemplate;

        @GetMapping("/index")
        public String index(Model model) {
            String sql = "SELECT * FROM test_table";
            List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
            model.addAttribute("testList", list);
            return "index";
        }

        @GetMapping("/top")
        public String top(Model model){
            return "top";
        }

        @GetMapping("/search")
        public void searchTemp(Model model, @RequestParam Integer tmp)
        {

        }
    }


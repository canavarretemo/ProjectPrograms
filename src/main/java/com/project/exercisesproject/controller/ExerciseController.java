package com.project.exercisesproject.controller;


import com.project.exercisesproject.response.ApiResponse;
import com.project.exercisesproject.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.exercisesproject.service.ExerciseService;

@RestController
@RequestMapping("/api/exercises")
@Validated
public class ExerciseController {

    private final ExerciseService userService;
    // Constructor con @Autowired (Recomendado para inyección de dependencias)
    @Autowired
    public ExerciseController(ExerciseService userService) {
        this.userService = userService;
    }

    // TODO: corregir cuando el usuario envía nula la palabra del endpoint
    // TODO: Do test
    @GetMapping("/palindrome/{word}")
    public ResponseEntity<ApiResponse<String>> getPalindromeWord(@PathVariable @NonNull String word) {
        String response = userService.isPalindrome(word);

        return ResponseEntity.ok(ResponseUtil.success("Process success", response, null));
    }

}

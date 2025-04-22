package com.project.exercisesproject.controller;


import com.project.exercisesproject.dto.numbersDTO;
import com.project.exercisesproject.response.ApiResponse;
import com.project.exercisesproject.util.ResponseUtil;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.project.exercisesproject.service.ExerciseService;

@RestController
@RequestMapping("/api/exercises")
@Validated
public class ExerciseController {

    private final ExerciseService exerciseService;
    // Constructor con @Autowired (Recomendado para inyección de dependencias)
    @Autowired
    public ExerciseController(ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }

    // TODO: corregir cuando el usuario envía nula la palabra del endpoint
    // TODO: Do test
    // TODO: return metadata with useful information
    @Operation(summary = "Check Palindrome word", description = "Return Yes if the word is palindrome, No if the word does not palidrone. The must be less than 50 characters")
    @GetMapping("/palindrome/{word}")
    public ResponseEntity<ApiResponse<String>> getPalindromeWord( @Parameter(description = "Palindrome word to check", required = true) @PathVariable @NonNull String word) {
        String response = exerciseService.isPalindrome(word);

        return ResponseEntity.ok(ResponseUtil.success("Process success", response, "Word: " + word));
    }
    // TODO: Valid jump line
    @Operation(summary = "Hello word program", description = "Return word Hello, World and Hello, Java.")
    @GetMapping("/helloWorld")
    public ResponseEntity<ApiResponse<String>> helloWorld() {
        String response = exerciseService.helloWorldJava();

        return ResponseEntity.ok(ResponseUtil.success("Process success", response, null));
    }
    // TODO: Valid null numbers, etc. Change description
    @Operation(summary = "Hello word program", description = "Return word Hello, World and Hello, Java.")
    @PostMapping("/printNumbers")
    public ResponseEntity<ApiResponse<String>> printNumbers(@RequestBody numbersDTO numbers) {
        String response = exerciseService.printNumbers(numbers);

        return ResponseEntity.ok(ResponseUtil.success("Process success", response, null));
    }

}

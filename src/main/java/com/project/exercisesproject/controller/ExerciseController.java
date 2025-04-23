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

import java.util.List;

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

    @Operation(summary = "Hello word program", description = "Return word Hello, World and Hello, Java.")
    @GetMapping("/helloWorld")
    public ResponseEntity<ApiResponse<String>> helloWorld() {
        String response = exerciseService.helloWorldJava();

        return ResponseEntity.ok(ResponseUtil.success("Process success", response, null));
    }
    // TODO: Valid null numbers, etc.
    @Operation(summary = "Print numbers", description = "Print numbers that user sent")
    @PostMapping("/printNumbers")
    public ResponseEntity<ApiResponse<String>> printNumbers(@RequestBody numbersDTO numbers) {
        String response = exerciseService.printNumbers(numbers);

        return ResponseEntity.ok(ResponseUtil.success("Process success", response, null));
    }

    @Operation(summary = "Print multiples", description = "Print first 10 multiples of given number")
    @GetMapping("/multiples/{number}")
    public ResponseEntity<ApiResponse<String>> multiples(@PathVariable @NonNull int number) {
        List<String> response = exerciseService.multiples(number);

        return ResponseEntity.ok(ResponseUtil.success("Process success", response.toString(), "number: " + number));
    }

    @Operation(summary = "Where number fit", description = "Print where a given number fit, data type.")
    @GetMapping("/fitnumber/{number}")
    public ResponseEntity<ApiResponse<String>> fitNumber(@PathVariable @NonNull long number) {
        String response = exerciseService.fitNumber(number);

        return ResponseEntity.ok(ResponseUtil.success("Process success", response, "number: " + number));
    }

}

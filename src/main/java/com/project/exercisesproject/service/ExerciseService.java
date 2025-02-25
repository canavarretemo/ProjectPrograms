package com.project.exercisesproject.service;

import org.springframework.stereotype.Service;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ExerciseService {


    public String isPalindrome(String word) {

        if(word.length() > 50 ||  word == null){
            return "El valor no puede ser mayor a 50 o ser nulo";
        }else{
            String reverse = Stream.of(word)
                    .map(string -> new StringBuilder(string).reverse())
                    .collect(Collectors.joining());
            if (word.equalsIgnoreCase(reverse)) {
                return "Yes";
            }

        }
        return "No";
    }
//
//    // Guardar usuario
//    public User saveUser(User user) {
//        return userRepository.save(user);
//    }
//
//    // Eliminar usuario
//    public void deleteById(Long id) {
//        userRepository.deleteById(id);
//    }
//
//    // Acepta Pageable en lugar de int page, int size
//    public Page<User> findAll(Pageable pageable) {
//        return userRepository.findAll(pageable);
//    }

    }


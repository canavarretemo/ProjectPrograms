package com.project.exercisesproject.service;

import com.project.exercisesproject.dto.numbersDTO;
import com.project.exercisesproject.model.HelloWorld;
import com.project.exercisesproject.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ExerciseService {

    @Autowired
    private ExerciseRepository exerciseRepository;

    public String isPalindrome(String word) {

        if (word.length() > 50) {
            return "El valor no puede ser mayor a 50.";
        } else {
            String reverse = Stream.of(word)
                    .map(string -> new StringBuilder(string).reverse())
                    .collect(Collectors.joining());
            if (word.equalsIgnoreCase(reverse)) {
                return "Is palindrome";
            }

        }
        return "Does not palindrome";
    }

    public String helloWorldJava() {

        Optional<HelloWorld> hello = exerciseRepository.findById(1L);

        if (hello.isPresent()) {
            return  hello.get().getMessage();
        } else {
            return  "No information";
        }
    }

    public String printNumbers(numbersDTO numbers) {

        /*
         public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        double d  = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
         */

        return "Your numbers are: " + numbers.getNumberOne() + ", " + numbers.getNumberTwo() + ", " + numbers.getNumberThree();
    }

    public List<String> multiples(int number) {

        List<String> tabla = new ArrayList<>();


        for (int i = 1; i <= 10; i++) {
            tabla.add(number + " x " + i + " = " + (number * i));
        }
        return tabla;
    }

    public String fitNumber(long number) {

        StringBuilder sb = new StringBuilder();

        sb.append(number)
                .append(" can be fitted in: ");

        if (number >= -128 && number <= 127) {
            sb.append(" byte ");
        }
        if (number >= -32768 && number <= 32767) {
            sb.append(" short");
        }

        if (number >= -2147483648 && number <= 2147483647) {
            sb.append(" int");
        }

        sb.append(" long");
        return sb.toString();
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


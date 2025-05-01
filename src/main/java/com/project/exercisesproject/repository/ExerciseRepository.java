package com.project.exercisesproject.repository;

import org.springframework.stereotype.Repository;

@Repository
public class ExerciseRepository extends JpaRepository<User, Long> {

    // Encuentra todos los usuarios con paginación (ya incluido en JpaRepository)
    Page<User> findAll(Pageable pageable);

    // Si necesitas filtrar por algún campo, puedes agregar métodos como estos:
    Page<User> findByUsernameContaining(String username, Pageable pageable);

}

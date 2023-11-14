package repository;

import com.example.demo.Faculty;

import java.util.Collection;

public interface FacultyRepository extends JpaRepository<Faculty,long> {

    Collection<Faculty> findAllByColor(String color);

    Collection<Faculty> findAllByNameOrColorIgnoreCase(String color, String name);

    Collection<Faculty> findAllStudentsById(long id);



}

package taskmanagement.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author MishaFre96
 *
 * Controlador de tareas.
 * Aquí se gestionan los endpoints relacionados con /api/tasks.
 */
@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    /**
     * GET /api/tasks
     *
     * Devuelve las tareas del sistema.
     * En esta fase aún no hay lógica, solo se deja el endpoint preparado.
     *
     * @return 200 OK vacío
     */
    @GetMapping
    public ResponseEntity<?> getTasks() {
        return ResponseEntity.ok().build();
    }
}
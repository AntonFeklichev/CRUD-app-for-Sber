/**
 * Пакет antonfeklichev.tasktrackerapp.controller содержит REST API контроллеры для управления задачами и подзадачами
 * в приложении.
 * <p>
 * Основные контроллеры:
 * <ul>
 *     <li>{@link antonfeklichev.tasktrackerapp.controller.TaskController}: Обрабатывает HTTP-запросы для создания, получения, обновления и удаления задач.</li>
 *     <li>{@link antonfeklichev.tasktrackerapp.controller.SubTaskController}: Обрабатывает HTTP-запросы для создания, получения, обновления и удаления подзадач,
 *     связанных с задачами.</li>
 * </ul>
 * <p>
 * Эти контроллеры взаимодействуют с сервисными слоями, такими как {@link antonfeklichev.tasktrackerapp.service.TaskService}
 * и {@link antonfeklichev.tasktrackerapp.service.SubTaskService}, выполняя бизнес-логику и возвращая данные в формате RESTful ответов.
 * <p>
 * Контроллеры используют аннотации Spring, такие как {@link org.springframework.web.bind.annotation.RestController},
 * {@link org.springframework.web.bind.annotation.RequestMapping}, {@link org.springframework.web.bind.annotation.PostMapping},
 * {@link org.springframework.web.bind.annotation.GetMapping}, {@link org.springframework.web.bind.annotation.PatchMapping}, 
 * и {@link org.springframework.web.bind.annotation.DeleteMapping}, чтобы обрабатывать различные типы HTTP-запросов.
 */
        package antonfeklichev.tasktrackerapp.controller;

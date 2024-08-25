
/**
 * Пакет antonfeklichev.tasktrackerapp.service содержит интерфейсы и их реализации, предоставляющие бизнес-логику
 * для управления задачами и подзадачами в приложении.
 * <p>
 * Основные интерфейсы и их реализации:
 * <ul>
 *     <li>{@link antonfeklichev.tasktrackerapp.service.TaskService}: Интерфейс для операций CRUD над задачами.</li>
 *     <li>{@link antonfeklichev.tasktrackerapp.service.SubTaskService}: Интерфейс для операций CRUD над подзадачами.</li>
 *     <li>{@link antonfeklichev.tasktrackerapp.service.TaskServiceImpl}: Реализация {@link antonfeklichev.tasktrackerapp.service.TaskService}, предоставляющая методы для создания, получения,
 *     обновления и удаления задач.</li>
 *     <li>{@link antonfeklichev.tasktrackerapp.service.SubTaskServiceImpl}: Реализация {@link antonfeklichev.tasktrackerapp.service.SubTaskService}, предоставляющая методы для создания, получения,
 *     обновления и удаления подзадач.</li>
 * </ul>
 * <p>
 * Эти сервисы служат связующим звеном между контроллерами и репозиториями, обрабатывая запросы на изменение данных
 * и обеспечивая целостность бизнес-логики.
 */
package antonfeklichev.tasktrackerapp.service;
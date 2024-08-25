/**
 * Пакет antonfeklichev.tasktrackerapp.dto содержит классы Data Transfer Objects (DTO), которые используются для передачи данных
 * между различными слоями приложения.
 * <p>
 * Основные классы:
 * <ul>
 *     <li>{@link antonfeklichev.tasktrackerapp.dto.NewSubTaskDto}: DTO для создания новой подзадачи, содержит поля для названия, описания и статуса подзадачи.</li>
 *     <li>{@link antonfeklichev.tasktrackerapp.dto.NewTaskDto}: DTO для создания новой задачи, включает название, описание и статус задачи.</li>
 *     <li>{@link antonfeklichev.tasktrackerapp.dto.QueryDslFilterDto}: DTO для фильтрации задач и подзадач, включает параметры фильтрации по статусу и названию.</li>
 *     <li>{@link antonfeklichev.tasktrackerapp.dto.SubTaskDto}: DTO для передачи данных подзадачи, включает идентификатор, название, описание, статус и идентификатор связанной задачи.</li>
 *     <li>{@link antonfeklichev.tasktrackerapp.dto.TaskDto}: DTO для передачи данных задачи, включает идентификатор, название, описание и статус задачи.</li>
 * </ul>
 * <p>
 * Эти DTO используются для удобной и безопасной передачи данных между контроллерами, сервисами и другими компонентами приложения,
 * способствуя четкой структуре и минимизации ошибок при обработке данных.
 */
package antonfeklichev.tasktrackerapp.dto;

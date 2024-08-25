/**
 * Пакет antonfeklichev.tasktrackerapp.entity содержит сущности, представляющие задачи и подзадачи в приложении.
 * <p>
 * Основные классы и перечисления:
 * <ul>
 *     <li>{@link antonfeklichev.tasktrackerapp.entity.Task}: Базовая сущность задачи, сохраняемая в таблице "tasks". Включает идентификатор, название, описание и статус задачи.</li>
 *     <li>{@link antonfeklichev.tasktrackerapp.entity.SubTask}: Сущность подзадачи, наследующая {@link antonfeklichev.tasktrackerapp.entity.Task} и хранящаяся в таблице "subtasks". Связана с родительской задачей через внешний ключ {@code task_id}.</li>
 *     <li>{@link antonfeklichev.tasktrackerapp.entity.TaskStatus}: Перечисление возможных статусов задач и подзадач, включая NEW, IN_PROGRESS и DONE.</li>
 * </ul>
 * <p>
 * Эти сущности используются для организации и управления задачами в приложении, поддерживая иерархическую структуру, где подзадачи могут быть ассоциированы с задачами.
 */
package antonfeklichev.tasktrackerapp.entity;
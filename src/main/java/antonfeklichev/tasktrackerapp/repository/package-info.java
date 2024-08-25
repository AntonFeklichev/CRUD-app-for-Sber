
/**
 * Пакет antonfeklichev.tasktrackerapp.repository содержит интерфейсы репозиториев, обеспечивающие доступ к данным
 * задач и подзадач в базе данных.
 * <p>
 * Основные интерфейсы:
 * <ul>
 *     <li>{@link antonfeklichev.tasktrackerapp.repository.TaskRepository}: Репозиторий для управления сущностями задач ({@link antonfeklichev.tasktrackerapp.entity.Task}).
 *     Наследует {@link org.springframework.data.jpa.repository.JpaRepository} и {@link org.springframework.data.querydsl.QuerydslPredicateExecutor} для выполнения стандартных операций CRUD
 *     и запросов с использованием Querydsl.</li>
 *     <li>{@link antonfeklichev.tasktrackerapp.repository.SubTaskRepository}: Репозиторий для управления сущностями подзадач ({@link antonfeklichev.tasktrackerapp.entity.SubTask}).
 *     Также наследует {@link org.springframework.data.jpa.repository.JpaRepository} и {@link org.springframework.data.querydsl.QuerydslPredicateExecutor}, и содержит дополнительный метод для
 *     получения подзадач, не соответствующих определенному статусу.</li>
 * </ul>
 * <p>
 * Эти репозитории обеспечивают взаимодействие с базой данных и используются в сервисах для выполнения операций с данными.
 */
package antonfeklichev.tasktrackerapp.repository;
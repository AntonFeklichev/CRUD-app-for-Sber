
/**
 * Пакет antonfeklichev.tasktrackerapp.mapper содержит интерфейсы мапперов, использующих MapStruct для преобразования
 * между сущностями и их соответствующими DTO.
 * <p>
 * Основные интерфейсы:
 * <ul>
 *     <li>{@link antonfeklichev.tasktrackerapp.mapper.TaskMapper}: Маппер для преобразования между сущностью {@link antonfeklichev.tasktrackerapp.entity.Task}
 *     и DTO {@link antonfeklichev.tasktrackerapp.dto.TaskDto}, {@link antonfeklichev.tasktrackerapp.dto.NewTaskDto}.
 *     Обеспечивает преобразование данных при создании, обновлении и получении задач.</li>
 *     <li>{@link antonfeklichev.tasktrackerapp.mapper.SubTaskMapper}: Маппер для преобразования между сущностью {@link antonfeklichev.tasktrackerapp.entity.SubTask}
 *     и DTO {@link antonfeklichev.tasktrackerapp.dto.SubTaskDto}, {@link antonfeklichev.tasktrackerapp.dto.NewSubTaskDto}.
 *     Обеспечивает преобразование данных при создании, обновлении и получении подзадач.</li>
 * </ul>
 * <p>
 * Эти мапперы автоматически генерируют код для преобразования данных, что упрощает и ускоряет работу с сущностями и DTO в приложении.
 * MapStruct использует аннотации для указания правил преобразования и стратегии обработки значений {@code null}.
 */
package antonfeklichev.tasktrackerapp.mapper;
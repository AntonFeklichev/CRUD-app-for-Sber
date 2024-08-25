/**
 * Пакет antonfeklichev.tasktrackerapp.exception содержит классы исключений и обработчики ошибок, используемые
 * в приложении для обработки различных исключительных ситуаций.
 * <p>
 * Основные классы:
 * <ul>
 *     <li>{@link antonfeklichev.tasktrackerapp.exception.DeleteTaskException}: Исключение, выбрасываемое при попытке удаления задачи, которую невозможно удалить из-за активных подзадач. Аннотировано {@link org.springframework.web.bind.annotation.ResponseStatus} с HTTP статусом 409 (CONFLICT).</li>
 *     <li>{@link antonfeklichev.tasktrackerapp.exception.SubTaskNotFoundException}: Исключение, выбрасываемое при отсутствии подзадачи с указанным идентификатором. Аннотировано {@link org.springframework.web.bind.annotation.ResponseStatus} с HTTP статусом 404 (NOT FOUND).</li>
 *     <li>{@link antonfeklichev.tasktrackerapp.exception.TaskNotFoundException}: Исключение, выбрасываемое при отсутствии задачи с указанным идентификатором. Аннотировано {@link org.springframework.web.bind.annotation.ResponseStatus} с HTTP статусом 404 (NOT FOUND).</li>
 *     <li>{@link antonfeklichev.tasktrackerapp.exception.UpdateTaskException}: Исключение, выбрасываемое при невозможности обновления задачи, например, из-за наличия незавершенных подзадач. Аннотировано {@link org.springframework.web.bind.annotation.ResponseStatus} с HTTP статусом 409 (CONFLICT).</li>
 *     <li>{@link antonfeklichev.tasktrackerapp.exception.TaskTrackerAppExceptionHandler}: Обработчик исключений, который перехватывает исключения, выбрасываемые в приложении, и возвращает корректные HTTP ответы с сообщениями об ошибках.</li>
 * </ul>
 * <p>
 * Эти классы и обработчики обеспечивают централизованную обработку ошибок и исключений в приложении, гарантируя корректные HTTP ответы и удобное информирование пользователей о возникших проблемах.
 */
package antonfeklichev.tasktrackerapp.exception;
/**
 * Пакет antonfeklichev.tasktrackerapp является корневым пакетом приложения Task Tracker.
 * <p>
 * Он содержит все основные компоненты приложения, организованные в следующие подкатегории:
 * <ul>
 *     <li>{@link antonfeklichev.tasktrackerapp.controller}: REST API контроллеры для управления задачами и подзадачами.</li>
 *     <li>{@link antonfeklichev.tasktrackerapp.dto}: Классы Data Transfer Objects (DTO) для передачи данных между слоями приложения.</li>
 *     <li>{@link antonfeklichev.tasktrackerapp.entity}: Сущности, представляющие задачи и подзадачи, сохраняемые в базе данных.</li>
 *     <li>{@link antonfeklichev.tasktrackerapp.exception}: Классы исключений и обработчики ошибок для обработки исключительных ситуаций.</li>
 *     <li>{@link antonfeklichev.tasktrackerapp.mapper}: Мапперы для преобразования сущностей в DTO и обратно, использующие MapStruct.</li>
 *     <li>{@link antonfeklichev.tasktrackerapp.repository}: Репозитории для доступа к данным задач и подзадач в базе данных.</li>
 *     <li>{@link antonfeklichev.tasktrackerapp.service}: Сервисные классы, реализующие бизнес-логику приложения.</li>
 * </ul>
 * <p>
 * Этот пакет и его подкатегории организуют код приложения, разделяя его на логические модули для обеспечения
 * высокой читаемости, тестируемости и удобства поддержки.
 */
package antonfeklichev.tasktrackerapp;
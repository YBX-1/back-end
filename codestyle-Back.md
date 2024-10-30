



- **Package Naming**:
    - Use a descriptive package name that reflects the application's domain, e.g., `com.example.back`.

- **Class Naming**:
    - Use UpperCamelCase for class names, e.g., `ContactsController`.
    - Entity classes representing database tables should be named in the plural form, e.g., `Contacts`.

- **Interface Naming**:
    - Use UpperCamelCase for interface names, e.g., `ContactRepository`.

- **Method Naming**:
    - Use UpperCamelCase for method names, e.g., `getAllContacts`.
    - Use verbs or verb phrases to describe the action, e.g., `addContact`, `updateContacts`.

- **Variable Naming**:
    - Use lowerCamelCase for variable names, e.g., `contactSer`, `contacts`.
    - Use nouns or noun phrases to describe the variable, e.g., `id`, `name`, `number`.

- **Annotation Placement**:
    - Place import statements at the top of the file, grouped by category (e.g., Spring annotations, Java annotations, third-party libraries).
    - Place class annotations immediately before the class declaration.



- **Imports**:
    - Avoid wildcard imports; use specific imports instead.
    - Keep imports organized and avoid unnecessary imports.

- **Annotations**:
    - Use `@RestController` for controller classes.
    - Use `@RequestMapping` for defining the base path of the controller.
    - Use `@CrossOrigin` to enable CORS.
    - Use `@Resource` or `@Autowired` for dependency injection.

- **Entity Classes**:
    - Use `@Entity` to denote a JPA entity.
    - Use `@Table` to specify the table name.
    - Use `@Id` and `@GeneratedValue` for the primary key.
    - Use `@Data` from Lombok for boilerplate-free code.

- **Repository Interface**:
    - Extend `JpaRepository` for database operations.
    - Use generic types to specify the entity and ID types.

- **Service Layer**:
    - Use `@Service` annotation for service classes.
    - Use `@Autowired` for dependency injection.

- **Controller Layer**:
    - Use `@RestController` annotation for RESTful controllers.
    - Use `@RequestMapping` or its HTTP method-specific counterparts (`@PostMapping`, `@PutMapping`, `@DeleteMapping`) to define routes.
    - Use `@PathVariable`, `@RequestBody`, and other annotations to handle request data.

## 3. Best Practices

- **Error Handling**:
    - Use exceptions and status codes to handle errors gracefully.
    - Return meaningful error messages and status codes.

- **Response Entity**:
    - Use `ResponseEntity` to control the HTTP response status and headers.
    - Return a consistent response structure, including status codes and messages.

- **Data Access**:
    - Use repository methods to interact with the database.
    - Avoid manual database queries in the service layer.

- **Business Logic**:
    - Keep business logic in the service layer.
    - Keep controllers lean and focused on request handling.

- **CORS Configuration**:
    - Configure CORS with `@CrossOrigin` to allow or restrict specific origins.

## 4. Formatting and Comments

- **Formatting**:
    - Use 4 spaces for indentation.
    - Keep lines within 120 characters for better readability.
    - Place 1 space after colons in control structures (`if`, `for`, `while`, etc.).

- **Comments**:
    - Use Javadoc comments for methods that describe parameters, return values, and exceptions.
    - Use inline comments to explain non-obvious code segments.

## 5. Security and Performance

- **Security**:
    - Sanitize and validate user input to prevent injection attacks.
    - Use HTTPS to secure API endpoints.

- **Performance**:
    - Use lazy loading for associations when necessary to improve performance.
    - Optimize database queries to reduce response times.

Please adhere to these guidelines to maintain consistency, readability, and maintainability of the code. These rules are based on best practices and can be adjusted according to the specific needs of the project.
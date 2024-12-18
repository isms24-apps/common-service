# common-service
The `common` Service serves as a shared utility module for both the Admin and E-commerce services, offering a centralized repository for Value Objects (VOs) and other reusable components. By leveraging this service, we ensure consistency, reusability, and maintainability across multiple backend applications. This modular design enables seamless integration into the Admin and E-commerce services by adding it as a Maven snapshot dependency and including it in the build path.



## Prerequisites

- **Java 17** or higher.
- **Maven** for dependency management.


## Key Features

1. `Centralized VO Management`: Defines and maintains commonly used Value Objects (VOs), such as EshopUserVO, Enums such as ApprovalStatus,etc  ensuring uniformity across services.

2. `Reusability`: Eliminates redundancy by providing shared resources that can be utilized across multiple backend services.

3. `Consistency`: Ensures that changes to shared objects are reflected consistently in all dependent services.


## Building the Common Service

### Clone the Repository

1. Clone the repository and navigate to the project directory:

   ```bash
   git clone <repository-url>
   cd common-service
   ```

2. Build the project:

    ```bash
    mvn clean install
    ```


## Integration

**Adding Common Service to Your Project**

1. Build the Common Service as a Maven snapshot:

    ```bash
   mvn clean install
   ```

2. Add the dependency to your service's pom.xml:

    ```bash
    <dependency>
        <groupId>com.collections</groupId>
        <artifactId>common-service</artifactId>
        <version>1.0-SNAPSHOT</version>
    </dependency>
    ```

3. Ensure the Common Service's build path is included in the project setup.


## Benefits

**Streamlined Development**: Reduces duplication and accelerates development by providing ready-to-use VOs and reusable components.

**Improved Maintainability**: Centralized updates to shared objects automatically propagate to dependent services.

**Consistency**: Ensures uniform data models across the Admin and E-commerce services.



The Common Service is a foundational component designed to foster reusability, consistency, and efficiency across the Admin and E-commerce backend services. By centralizing shared logic and resources, it simplifies development and enhances the overall maintainability of the system.

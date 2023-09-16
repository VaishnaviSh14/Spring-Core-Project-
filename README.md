# Spring Core Project 
# Online Shopping System with Spring Framework

# Description:
Java project that simulates an online shopping system using the Spring Framework. 

Class Definitions:

Flipkart: This class represents the online shopping platform. It is annotated as a Spring component ("fpkt") and uses Spring's dependency injection to inject a courier service and a date object.
It contains a shopping method that calculates the total bill amount and uses a courier service to deliver the order.

DTDC, FedEx, and BlueDart: These classes implement the Courier interface and represent different courier services. They are also Spring components and provide specific delivery functionality.

Test: This class serves as the main entry point of the application. It creates a Spring ApplicationContext based on the configuration provided in AnnotationConfig, retrieves a Flipkart bean from the container, and performs a shopping operation.
Spring Configuration:

In summary, this project represents an online shopping system where the Flipkart class acts as the online store, and different courier services (DTDC, FedEx, and BlueDart) are available for order delivery.
The Test class demonstrates how to use these components within a Spring-based application. 
The project seems to focus on demonstrating the usage of Spring's dependency injection and component scanning capabilities for building an e-commerce system.


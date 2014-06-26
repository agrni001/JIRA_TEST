# Core Java Framework

## Introduction
The core java framework will contain common code used across all services (war) and framework pieces (jars). 
It will consist of common files and functionality which is reusable and can be extended by all layers. 

It will comprise of following key components:

##### Config
This folder will contain the ConfigLoader and Config Bean classes. Exceptions: It will contain base and all custom exception classes

##### Constants
It will contain encryption, decryption and security related classes 

##### Util
It will contain utility classes like ContextUtils, SpringWrapper etc. model: It will contain core model classes

## Install

## Getting Started

## Key Features and Technologies

### Functional

#### ConfigSyncAspect
This AOP bean will synchronize changes made to any @ConfigEnabled and @ManagedAttribute JMX managed bean with the MongoDB using ConfigService. 
When any setter method is executed that matches these annotations, the ConfigSyncAspect.sync() method will get executed and update Mongo appConfig collection
that matches the current running ServerId, the BeanId with the ConfigKey and ConfigValue that was changed. 

### Test Cases
For documentation on writing test cases, please refer to this




#### ConfigSyncAspectTest
Test case to ensure that ConfigSyncAspect.sync() method is executed with the correct values from the JointPoint.

## Support

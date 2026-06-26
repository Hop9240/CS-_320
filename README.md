# CS 320 Portfolio

This repository contains selected artifacts from my CS 320 Software Testing, Automation, and Quality Assurance course. These artifacts show my work with unit testing, software automation, requirements-based development, and quality assurance.

## Artifacts Included

### Project One: Contact Service

For Project One, I included the following Contact service files:

- `Contact.java`
- `ContactService.java`
- `ContactTest.java`
- `ContactServiceTest.java`

These files show how I created Java classes and used JUnit tests to check that the program followed the required contact service rules.

### Project Two: Summary and Reflections Report

For Project Two, I included my summary and reflections report. This report explains my testing approach, the testing techniques I used, and how I made sure my code aligned with the software requirements.

## Reflection

### How can I ensure that my code, program, or software is functional and secure?

I can ensure that my code, program, or software is functional and secure by testing the requirements and validating the input. In this project, I used JUnit assertions to check that the required behavior was working the way it should. I used `assertEquals()` to make sure the correct data was being stored and returned. For example, `assertEquals("773", contact.getContactId());` made sure that the contact ID `"773"` was saved in the object and returned correctly by the getter method. I also used `assertThrows()` to check invalid input. For example, `assertThrows(IllegalArgumentException.class, () -> { new Contact(null, "Dastarr", "Pottinger", "5739315328", "3555 s Cottage Grove"); });` proved that the program threw an exception when the contact ID was null. This helped make the program more secure because it rejected invalid data instead of allowing bad input into the system. I was not just assuming the program worked or relying on printed output. I used assertions to prove that valid input worked and invalid input was rejected.

### How do I interpret user needs and incorporate them into a program?

I interpret user needs by breaking the client’s requirements down into specific rules that the program must follow. In this project, the client needed the contact, task, and appointment services to store valid information while rejecting invalid information. For example, the client required IDs to not be null and to be no more than 10 characters. I incorporated that need into the program by writing validation logic and JUnit tests that checked both valid and invalid input. I used the same approach for the other fields, such as contact names, phone numbers, addresses, task names, task descriptions, appointment descriptions, and appointment dates. By testing both accepted and rejected values, I made sure the program matched the client’s expectations. This helped me turn the user’s needs into working software requirements instead of just guessing what the program should do.

### How do I approach designing software?

I approach designing software by starting with the requirements and breaking the program into smaller parts. In this project, that meant separating the objects, such as Contact, Task, and Appointment, from the service classes that managed them. I had to think about what each class was responsible for and how one weak part of the code could affect another part of the program. For example, if the Contact class allowed bad data, then the ContactService could store that bad data. My mindset while designing the software was one of caution. I could not assume the program worked just because the code compiled. Code can compile and still fail to meet the client’s requirements. Because of that, I designed and tested around both valid and invalid situations, such as null IDs, IDs that were too long, duplicate IDs, and appointment dates in the past. I also used JUnit assertions like `assertEquals()` and `assertThrows()` to prove the results instead of trusting my own opinion. This helped me stay disciplined, limit bias, and avoid technical debt by making sure the design followed the requirements before moving forward.

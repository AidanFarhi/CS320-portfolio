# CS320-portfolio

- How can I ensure that my code, program, or software is functional and secure?

To ensure correct functionality with my software, I write tests that validate the requirements are being satisfied and
that there are no errors. The most common form of this is unit tests. For example, in the final project I wrote detailed
tests that confirmed the constraints of each class were met. I did my best to account for every edge case and
achieved 100% code coverage. Security is ensured by first manually scanning the code for any logical errors.
Next, a static tool like OWASP Dependency-Check could be introduced to make sure there are no open vulnerabilites present within the code.
Although I did not implement that in this case, it definetly is a practice I believe is crucial for real-world projects.

- How do I interpret user needs and incorporate them into a program?

In this case, the user needs were very clearly spelled out in the requirements document. I translated the requirements
into a set of classes and then validated the functionality using JUnit. Realistically, requirements are not
that clearly defined. When that is the case, I do my best to ask as many questions as possible during the
intake process and ask for during the development cycle.

- How do I approach designing software?

Most of the software I build is either data pipelines or REST APIs. I always try to think of the simplest
possible solution to the problem. I despise overly complicated architectures and believe
complexity is the bane of all software engineering. That being said, there is a time and a place
for complexity, especially when the problem is very complicated. Simple, boring, and reliable
beats complex and buggy any day of the week.

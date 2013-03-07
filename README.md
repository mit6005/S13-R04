# 6.005 Spring 2013 Recitation 4: Interpreter & Visitor

The `tree` package contains our initial code for the BinaryTree datatype.

`tree2` implements traversals with the interpreter pattern.

`tree3` implements traversals with the visitor pattern.

The interpreter & visitor patterns are an excellent opportunity to check your understanding:

 * Are you comfortable with all the syntax used in these patterns? Use the links at the bottom of [R04], the [Java tutorial], and lectures on [exceptions], [inheritance], etc.
 * Can you explain why these patterns are useful for manipulating [recursive datatypes]?
 * Can you step away from the code and think about [ADTs] & operations regardless of what pattern is used to implement them? Can you write their [specifications]?
 * Would you be comfortable with a visitor that changed its own state? Could you model it as a [state machine]?
 * Could you write [tests] for programs that use these structures?

  [R04]: http://web.mit.edu/6.005/www/sp13/recitations/r04/
  [Java tutorial]: http://web.mit.edu/6.005/www/sp13/tutorial/
  [exceptions]: https://stellar.mit.edu/S/course/6/sp13/6.005/courseMaterial/topics/topic5/lectureNotes/lect4-specifications/lect4-specifications.pdf
  [inheritance]: https://stellar.mit.edu/S/course/6/sp13/6.005/courseMaterial/topics/topic5/lectureNotes/L13-Inheritance-and-Equality/L13-Inheritance-and-Equality-print.pdf
  [recursive datatypes]: https://stellar.mit.edu/S/course/6/sp13/6.005/courseMaterial/topics/topic5/lectureNotes/lect11-recursivedatatypes/lect11-recursivedatatypes.pdf
  [ADTs]: https://stellar.mit.edu/S/course/6/sp13/6.005/courseMaterial/topics/topic5/lectureNotes/lect9-ADT/lect9-ADT.pdf
  [specifications]: https://stellar.mit.edu/S/course/6/sp13/6.005/courseMaterial/topics/topic5/lectureNotes/lect4-specifications/lect4-specifications.pdf
  [state machine]: https://stellar.mit.edu/S/course/6/sp13/6.005/courseMaterial/topics/topic5/lectureNotes/lect7-statemachines/lect7-statemachines.pdf
  [tests]: https://stellar.mit.edu/S/course/6/sp13/6.005/courseMaterial/topics/topic5/lectureNotes/Bugs/Bugs.pdf

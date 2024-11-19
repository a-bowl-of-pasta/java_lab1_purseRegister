* the strategies i am using are the factory and a bridge/adapter/mediator pattern
* the factory is being used to mass produce the denominations and the various classes that extend moneyContainer
* the mediator pettern is being used to introduce communication between 2 classes that impliment the same abstract class
* I did not mess with the logic all that much, I mostly restructured the lab to include patterns
* logic was not changed, but it was moved to new classes and repurposed
  WHAT WAS CHANGED :: 
* the only things really changed are the files in the MONEY package
* ------- money container is my new abstract class that holds base functionality
* ------- purse is now a class that extends moneyContainer
* ------- regester also extends moneyContainer, it is supposed to be a cash register
* ------- M_factory is the factory method that creates the different MoneyContainers
* ------- moneyContainer has a denomination factory that mass produces denomination objs
* ------- M_transfer is the mediator patterns that operates on the given objs
* M_transger needs more functionality, I just wanted to put SOMETHING in there
* M_factory will have more functionality when I include more classes that extend MoneyContainer
ADDITIONAL NOTES ::
* GUI is the same old same old
* Console testing needs to be written
* Looking through the code will give you a better idea of the changes, running it will not show as much

package org.assertj.examples.data;

import org.assertj.core.api.AbstractAssert;


/**
 * Abstract base class for {@link TolkienCharacter} specific assertions - Generated by CustomAssertionGenerator.
 */
public abstract class AbstractTolkienCharacterAssert<S extends AbstractTolkienCharacterAssert<S, A>, A extends TolkienCharacter> extends AbstractAssert<S, A> {

  /**
   * Creates a new <code>{@link AbstractTolkienCharacterAssert}</code> to make assertions on actual TolkienCharacter.
   * @param actual the TolkienCharacter we want to make assertions on.
   */
  protected AbstractTolkienCharacterAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  /**
   * Verifies that the actual TolkienCharacter's name is equal to the given one.
   * @param name the given name to compare the actual TolkienCharacter's name to.
   * @return this assertion object.
   * @throws AssertionError - if the actual TolkienCharacter's name is not equal to the given one.
   */
  public S hasName(String name) {
    // check that actual TolkienCharacter we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpected name of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    String actualName = actual.getName();
    if (!org.assertj.core.util.Objects.areEqual(actualName, name)) {
      failWithMessage(assertjErrorMessage, actual, name, actualName);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual TolkienCharacter's race is equal to the given one.
   * @param race the given race to compare the actual TolkienCharacter's race to.
   * @return this assertion object.
   * @throws AssertionError - if the actual TolkienCharacter's race is not equal to the given one.
   */
  public S hasRace(Race race) {
    // check that actual TolkienCharacter we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpected race of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    Race actualRace = actual.getRace();
    if (!org.assertj.core.util.Objects.areEqual(actualRace, race)) {
      failWithMessage(assertjErrorMessage, actual, race, actualRace);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual TolkienCharacter's age is equal to the given one.
   * @param age the given age to compare the actual TolkienCharacter's age to.
   * @return this assertion object.
   * @throws AssertionError - if the actual TolkienCharacter's age is not equal to the given one.
   */
  public S hasAge(int age) {
    // check that actual TolkienCharacter we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpected age of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // check
    int actualAge = actual.age;
    if (actualAge != age) {
      failWithMessage(assertjErrorMessage, actual, age, actualAge);
    }

    // return the current assertion for method chaining
    return myself;
  }

}

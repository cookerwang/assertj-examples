package org.assertj.examples.data.neo4j;


/**
 * {@link DragonBallGraph} specific assertions - Generated by CustomAssertionGenerator.
 *
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it, 
 * extend {@link AbstractDragonBallGraphAssert} instead.
 */
public class DragonBallGraphAssert extends AbstractDragonBallGraphAssert<DragonBallGraphAssert, DragonBallGraph> {

  /**
   * Creates a new <code>{@link DragonBallGraphAssert}</code> to make assertions on actual DragonBallGraph.
   * @param actual the DragonBallGraph we want to make assertions on.
   */
  public DragonBallGraphAssert(DragonBallGraph actual) {
    super(actual, DragonBallGraphAssert.class);
  }

  /**
   * An entry point for DragonBallGraphAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myDragonBallGraph)</code> and get specific assertion with code completion.
   * @param actual the DragonBallGraph we want to make assertions on.
   * @return a new <code>{@link DragonBallGraphAssert}</code>
   */
  public static DragonBallGraphAssert assertThat(DragonBallGraph actual) {
    return new DragonBallGraphAssert(actual);
  }
}

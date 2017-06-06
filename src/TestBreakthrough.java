import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.*;


/** Initial test case class for Breakthrough
 *
 * @author Adam Scerra
 * @date 11/9/15
 *
*/
public class TestBreakthrough {
  Breakthrough game;
  /** Fixture */
  @Before
  public void setUp() {
    game = new BreakthroughImpl();
  }

  @Test
  public void shouldHaveBlackPieceOn00() {
    assertEquals( "Black has piece on (0,0)",
                  BreakthroughImpl.PieceType.BLACK, game.getPieceAt(0,0) );
  }
  @Test
  public void shouldHaveWhitePieceOn70() {
    assertEquals( "White has piece on (7,0)",
                  BreakthroughImpl.PieceType.WHITE, game.getPieceAt(7,0) );
  }
  @Test
  public void testGetPlayerTurn() {
	assertEquals("It is White's turn ",
				  BreakthroughImpl.PlayerType.WHITE,game.getPlayerInTurn());
  }
  @Test
  public void testGetWinner() {
	  assertEquals("White is the winner ",
			  BreakthroughImpl.PlayerType.WHITE,game.getWinner());
  }
  @Test
  public void testIsMoveValid() {
	  assertTrue("Move is valid", game.isMoveValid(6, 6, 5, 5));
	  assertFalse("Move is not valid ", game.isMoveValid(0,0,0,0));
  }
  @Test
  public void testMove() {
	  assertEquals("The Piece at 7,7 is White ", Breakthrough.PieceType.WHITE, game.getPieceAt(7,7));
	  game.move(6, 6, 4, 5);
	  assertEquals("The Piece at 6,6 is White ", Breakthrough.PieceType.WHITE, game.getPieceAt(6,6));
	  
  }
}
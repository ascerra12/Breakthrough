/** Implementation.
*
* @author Adam Scerra
* @date 11/9/15
*
*/
public class BreakthroughImpl implements Breakthrough {
	private final int size = 8;
	static final int NONE = 0;
	static final int WHITE = 1;
	static final int BLACK = 2;
	int count = 0;
	
	private PieceType [][]boardPosition = new PieceType [size][size];
    public BreakthroughImpl() {
		for (int x = 0; x < size; x++) {
			for(int y = 0; y < size; y++) {
				if(x < 2) {
					boardPosition[x][y] = PieceType.BLACK;
				}
				else if (x > 5) {
					boardPosition[x][y] = PieceType.WHITE;
				}
				else { 
					boardPosition[x][y] = PieceType.NONE;
				}
			}
		}
    }
				
public PieceType getPieceAt (int row, int column) {
	return boardPosition[row][column];
	}

public PlayerType getPlayerInTurn() {
	return PlayerType.WHITE;
	}

public PlayerType getWinner() {
	return PlayerType.WHITE;
	}

public boolean isMoveValid(int fromRow, int fromColumn, int toRow,
							int toColumn) {
	if(toColumn >= size)
		return false;
	else if(Math.abs(fromColumn - toColumn) > 1)
		return false;
	else if(fromRow - toRow != 1)
		return false;
	else
		return true;
	}

public void move(int fromRow, int fromColumn, int toRow,
				int toColumn) {
	if (isMoveValid(fromRow, fromColumn, toRow, toColumn)) {
		boardPosition[toRow][toColumn] = getPieceAt(fromRow, 
												fromColumn);
		boardPosition[fromRow][fromColumn] = PieceType.NONE;
	}
}
}


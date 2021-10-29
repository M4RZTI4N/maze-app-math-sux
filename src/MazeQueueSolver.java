public class MazeQueueSolver extends MazeSolver{
    private Maze m;
    private String path;
    private boolean solved;
    private boolean valid;
    private MyQueue<Square> queue;
    public MazeQueueSolver(Maze maze)
    {
        super(maze);
    }
    public void makeEmpty()
    {
        this.queue = new MyQueue<Square>();
    }
    public void add(Square sq)
    {
        this.queue.enqueue(sq);
    }
    public Square next()
    {
        if(!this.isEmpty())
        {
            return this.queue.dequeue();
        } else {
            return null;
        }
    }
    public boolean isEmpty()
    {
        return this.queue.isEmpty();
    }
}

package Iterator;

public interface Iterator<E> {
    public E next();
    public boolean hasNext();
}

class TopicIterator implements Iterator<Topic>{

    Topic[] topics ;
    int position;

    public TopicIterator(Topic[] topics) {
        this.topics = topics;
        this.position = 0;
    }

    @Override
    public Topic next() {
        return this.topics[position++];
    }

    @Override
    public boolean hasNext() {
        return position<=this.topics.length-1;
    }
}

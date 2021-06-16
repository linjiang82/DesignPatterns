package Iterator;

public interface Iterable<E> {
    public Iterator<E> iterator();
}

class Topic {
    String name;

    public Topic(String name) {
        this.name = name;
    }
}

class TopicIterable implements Iterable<Topic>{
    Topic[] topics;

    public TopicIterable(Topic[] topics) {
        this.topics = topics;
    }

    @Override
    public Iterator<Topic> iterator() {
        return new TopicIterator(topics);
    }
}
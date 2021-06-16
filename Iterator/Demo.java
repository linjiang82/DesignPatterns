package Iterator;

public class Demo {
    public static void main(String[] args) {
        Topic[] topics = new Topic[5];
        topics[0]=new Topic("haha");
        topics[1]=new Topic("xixi");
        topics[2]=new Topic("gege");
        topics[3]=new Topic("tata");
        topics[4]=new Topic("mama");

        Iterable<Topic> topicIterable = new TopicIterable(topics);
        Iterator<Topic> topicIterator = topicIterable.iterator();
        while(topicIterator.hasNext()){
            System.out.println(topicIterator.next().name);
        }

    }
}

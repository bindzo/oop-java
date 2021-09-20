package mck.infrastructure.adapter;

public interface ProducerFactoryInterface {
    public ProducerStrategyInterface createSQLProducer();
    public ProducerStrategyInterface createPubsubProducer(String topic);
}

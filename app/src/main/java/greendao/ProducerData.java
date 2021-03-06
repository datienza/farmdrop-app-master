package greendao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table PRODUCER_DATA.
 */
public class ProducerData {

    private Long id;
    private long producerId;
    private String producerName;
    private String producerImageURL;
    private String producerLocation;
    private String producerDescription;

    public ProducerData() {
    }

    public ProducerData(Long id) {
        this.id = id;
    }

    public ProducerData(Long id, long producerId, String producerName, String producerImageURL, String producerLocation, String producerDescription) {
        this.id = id;
        this.producerId = producerId;
        this.producerName = producerName;
        this.producerImageURL = producerImageURL;
        this.producerLocation = producerLocation;
        this.producerDescription = producerDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getProducerId() {
        return producerId;
    }

    public void setProducerId(long producerId) {
        this.producerId = producerId;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public String getProducerImageURL() {
        return producerImageURL;
    }

    public void setProducerImageURL(String producerImageURL) {
        this.producerImageURL = producerImageURL;
    }

    public String getProducerLocation() {
        return producerLocation;
    }

    public void setProducerLocation(String producerLocation) {
        this.producerLocation = producerLocation;
    }

    public String getProducerDescription() {
        return producerDescription;
    }

    public void setProducerDescription(String producerDescription) {
        this.producerDescription = producerDescription;
    }

}

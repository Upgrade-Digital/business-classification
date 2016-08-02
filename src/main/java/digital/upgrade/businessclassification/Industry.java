package digital.upgrade.businessclassification;

/**
 * Industry labels.
 */
public enum Industry implements SectorInformation {

  IT_SERVICE_CONSULTING {
    @Override
    public String code() {
      return "57201010";
    }

    @Override
    public String label() {
      return "IT Services & Consulting";
    }
  },
  SOFTWARE {
    @Override
    public String code() {
      return "57201020";
    }

    @Override
    public String label() {
      return "Software";
    }
  },
  INTERNET_SERVICES {
    @Override
    public String code() {
      return "57201030";
    }

    @Override
    public String label() {
      return "Internet Services";
    }
  }

}

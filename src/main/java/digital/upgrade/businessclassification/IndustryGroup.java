package digital.upgrade.businessclassification;

/**
 * Industry group enumeration.
 */
public enum IndustryGroup implements SectorInformation, Industries {

  SOFTWARE_SERVICES {
    public Industry[] industries = {
        Industry.INTERNET_SERVICES,
        Industry.IT_SERVICE_CONSULTING,
        Industry.SOFTWARE
    };

    @Override
    public Industry[] industries() {
      return industries;
    }

    @Override
    public String code() {
      return "572010";
    }

    @Override
    public String label() {
      return "Software & IT Services";
    }
  }
}

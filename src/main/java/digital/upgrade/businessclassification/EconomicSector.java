package digital.upgrade.businessclassification;

/**
 * Economic sector as defined by the thompson routers economic sectors.
 *
 * @see 'https://en.wikipedia.org/wiki/Thomson_Reuters_Business_Classification'
 *
 * @author dak
 */
public enum EconomicSector implements SectorInformation, Sectors {

  ENERGY {
    @Override
    public String code() {
      return "50";
    }

    @Override
    public String label() {
      return "Energy";
    }
  },
  BASIC_MATERIALS {
    @Override
    public String code() {
      return "51";
    }

    @Override
    public String label() {
      return "Basic Materials";
    }
  },
  INDUSTRIALS {
    @Override
    public String code() {
      return "52";
    }

    @Override
    public String label() {
      return "Industrial";
    }
  },
  CYCLICAL_GOODS {
    @Override
    public String code() {
      return "53";
    }

    @Override
    public String label() {
      return "Cyclical Consumer Goods & Services";
    }
  },
  NON_CYCLICAL_GOOD {
    @Override
    public String code() {
      return "54";
    }

    @Override
    public String label() {
      return "Non-Cyclical Consumer Goods & Services";
    }
  },
  FINANCIAL {
    @Override
    public String code() {
      return "55";
    }

    @Override
    public String label() {
      return "Financials";
    }
  },
  HEALTHCARE {
    @Override
    public String code() {
      return "56";
    }

    @Override
    public String label() {
      return "Healthcare";
    }
  },
  TECHNOLOGY {

    public BusinessSector[] technologySectors = {
        BusinessSector.SOFTWARE_SERVICES
    };

    @Override
    public String code() {
      return "57";
    }

    @Override
    public String label() {
      return "Technology";
    }

    @Override
    public BusinessSector[] sectors() {
      return technologySectors;
    }
  },
  TELECOMMUNICATIONS {
    @Override
    public String code() {
      return "58";
    }

    @Override
    public String label() {
      return "Telecommunications Services";
    }
  },
  UTILITIES {
    @Override
    public String code() {
      return "59";
    }

    @Override
    public String label() {
      return "Utilities";
    }
  };

  private static final BusinessSector[] NO_SECTORS = new BusinessSector[0];

  public BusinessSector[] sectors() {
    return NO_SECTORS;
  }
}

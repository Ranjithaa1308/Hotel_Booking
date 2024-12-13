export class Hotel {
    hId: number;
    hname: string;
    haddress: string;
    hcity: string;
    hcontact: string;
    hdescription: string;
    hrating: string;
    himage: string;

    constructor(
        hId: number,
        hname: string,
        haddress: string,
        hcity: string,
        hcontact: string,
        hdescription: string,
        hrating: string,
        himage: string)
    {
        this.hId = hId;
        this.hname = hname;
        this.haddress = haddress;
        this.hcity = hcity;
        this.hcontact = hcontact;
        this.hdescription = hdescription;
        this.hrating = hrating;
        this.himage = himage;
    }
}
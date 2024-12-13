export class Admin {
    adminID: number;
    adminName: any;
    adminPassword: string;

    constructor(
            adminId: number,
            name: string,
            password: string) {
        this.adminID = adminId;
        this.adminName = name;
        this.adminPassword = password;
    }
}
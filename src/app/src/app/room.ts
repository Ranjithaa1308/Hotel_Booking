export class Room {rId: number;
    room_type: string;
    room_price: number;
    avaliability_status: string;

    constructor(rId: number,
        room_type: string,
        room_price: number,
        avaliability_status: string) {
        this.rId = rId;
        this.room_type = room_type;
        this.room_price = room_price;
        this.avaliability_status = avaliability_status;
    }
}
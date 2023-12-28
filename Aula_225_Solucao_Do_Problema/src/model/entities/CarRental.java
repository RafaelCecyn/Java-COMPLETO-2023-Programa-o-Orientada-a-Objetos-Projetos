package model.entities;

import java.time.LocalDateTime;

public class CarRental {
	
	private LocalDateTime start;
	private LocalDateTime finsih;
	
	private Vehicle vehicle;
	private Invoice invoice;
	
	public CarRental() {
	}

	public CarRental(LocalDateTime start, LocalDateTime finsih, Vehicle vehicle) {
		this.start = start;
		this.finsih = finsih;
		this.vehicle = vehicle;
	}

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getFinsih() {
		return finsih;
	}

	public void setFinsih(LocalDateTime finsih) {
		this.finsih = finsih;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
}

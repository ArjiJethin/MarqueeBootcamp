	.file	"month_name.c"
	.text
	.section .rdata,"dr"
.LC0:
	.ascii "%d\0"
.LC1:
	.ascii "January\12\12\0"
.LC2:
	.ascii "February\12\12\0"
.LC3:
	.ascii "March\12\12\0"
.LC4:
	.ascii "April\12\12\0"
.LC5:
	.ascii "May\12\12\0"
.LC6:
	.ascii "June\12\12\0"
.LC7:
	.ascii "July\12\12\0"
.LC8:
	.ascii "August\12\12\0"
.LC9:
	.ascii "September\12\12\0"
.LC10:
	.ascii "October\12\12\0"
.LC11:
	.ascii "November\12\12\0"
.LC12:
	.ascii "December\12\12\0"
	.text
	.globl	main
	.def	main;	.scl	2;	.type	32;	.endef
	.seh_proc	main
main:
	pushq	%rbp
	.seh_pushreg	%rbp
	movq	%rsp, %rbp
	.seh_setframe	%rbp, 0
	subq	$48, %rsp
	.seh_stackalloc	48
	.seh_endprologue
	call	__main
	leaq	-4(%rbp), %rax
	movq	%rax, %rdx
	leaq	.LC0(%rip), %rax
	movq	%rax, %rcx
	call	scanf
	movl	-4(%rbp), %eax
	cmpl	$12, %eax
	ja	.L2
	movl	%eax, %eax
	leaq	0(,%rax,4), %rdx
	leaq	.L4(%rip), %rax
	movl	(%rdx,%rax), %eax
	cltq
	leaq	.L4(%rip), %rdx
	addq	%rdx, %rax
	jmp	*%rax
	.section .rdata,"dr"
	.align 4
.L4:
	.long	.L2-.L4
	.long	.L15-.L4
	.long	.L14-.L4
	.long	.L13-.L4
	.long	.L12-.L4
	.long	.L11-.L4
	.long	.L10-.L4
	.long	.L9-.L4
	.long	.L8-.L4
	.long	.L7-.L4
	.long	.L6-.L4
	.long	.L5-.L4
	.long	.L3-.L4
	.text
.L15:
	leaq	.LC1(%rip), %rax
	movq	%rax, %rcx
	call	puts
	jmp	.L2
.L14:
	leaq	.LC2(%rip), %rax
	movq	%rax, %rcx
	call	puts
	jmp	.L2
.L13:
	leaq	.LC3(%rip), %rax
	movq	%rax, %rcx
	call	puts
	jmp	.L2
.L12:
	leaq	.LC4(%rip), %rax
	movq	%rax, %rcx
	call	puts
	jmp	.L2
.L11:
	leaq	.LC5(%rip), %rax
	movq	%rax, %rcx
	call	puts
	jmp	.L2
.L10:
	leaq	.LC6(%rip), %rax
	movq	%rax, %rcx
	call	puts
	jmp	.L2
.L9:
	leaq	.LC7(%rip), %rax
	movq	%rax, %rcx
	call	puts
	jmp	.L2
.L8:
	leaq	.LC8(%rip), %rax
	movq	%rax, %rcx
	call	puts
	jmp	.L2
.L7:
	leaq	.LC9(%rip), %rax
	movq	%rax, %rcx
	call	puts
	jmp	.L2
.L6:
	leaq	.LC10(%rip), %rax
	movq	%rax, %rcx
	call	puts
	jmp	.L2
.L5:
	leaq	.LC11(%rip), %rax
	movq	%rax, %rcx
	call	puts
	jmp	.L2
.L3:
	leaq	.LC12(%rip), %rax
	movq	%rax, %rcx
	call	puts
	nop
.L2:
	movl	$0, %eax
	addq	$48, %rsp
	popq	%rbp
	ret
	.seh_endproc
	.def	__main;	.scl	2;	.type	32;	.endef
	.ident	"GCC: (MinGW-W64 x86_64-ucrt-posix-seh, built by Brecht Sanders, r3) 14.2.0"
	.def	scanf;	.scl	2;	.type	32;	.endef
	.def	puts;	.scl	2;	.type	32;	.endef

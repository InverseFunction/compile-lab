#ifndef MIDL_h
#define MIDL_h

#ifndef rti_me_cpp_hxx
#include "rti_me_cpp.hxx"
#endif

#ifdef NDDS_USER_DLL_EXPORT
#if (defined(RTI_WIN32) || defined(RTI_WINCE))
#undef NDDSUSERDllExport
#define NDDSUSERDllExport __declspec(dllexport)
#endif
#else
#undef NDDSUSERDllExport
#define NDDSUSERDllExport
#endif
struct space_ASeq;
class space_ATypeSupport;
class space_ADataWriter;
class space_ADataReader;class space{
public :
typrdef struct space_Aseq Seq;
typrdef struct space_ATypeSupport TypeSupport;
typrdef struct space_ADataReader DataReader;
short i1 = 10 ;
};extern const char *modulespace_ATYPENAME;

REDA_DEFINE_SEQUENCE_STRUCT(modulespace_ASeq, module后紧跟的名称_A);

REDA_DEFINE_SEQUENCE_IN_C(modulespace_ASeq, module后紧跟的名称_A);

NDDSUSERDllExport extern RTI_BOOL
#ifdef NDDS_USER_DLL_EXPORT
#if (defined(RTI_WIN32) || defined(RTI_WINCE))
/* If the code is building on Windows, stop exporting symbols. */
#undef NDDSUSERDllExport
#define NDDSUSERDllExport
#endif
#endif

#endif
